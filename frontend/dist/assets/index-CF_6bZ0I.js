import React, { useState } from "react";

function Login() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const [loading, setLoading] = useState(false);

  const handleLogin = async (e) => {
    e.preventDefault();
    setError("");
    setLoading(true);

    // 🔍 Debug (can remove later)
    console.log("API URL =", process.env.REACT_APP_API_URL);

    try {
      const response = await fetch(
        `${process.env.REACT_APP_API_URL}/auth/login`,
        {
          method: "POST",
          headers: {
            "Content-Type": "application/json"
          },
          body: JSON.stringify({
            username: username,
            password: password
          })
        }
      );

      if (!response.ok) {
        throw new Error("Login failed");
      }

      const data = await response.json();

      // Save demo token
      localStorage.setItem("token", data.token);
      localStorage.setItem("role", data.role);

      alert("Login success");

      // Redirect (optional)
      window.location.href = "/dashboard";

    } catch (err) {
      setError("Invalid username or password");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div style={{ maxWidth: "400px", margin: "50px auto" }}>
      <h2>Login</h2>

      <form onSubmit={handleLogin}>
        <div>
          <label>Username</label>
          <input
            type="text"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            required
          />
        </div>

        <div style={{ marginTop: "10px" }}>
          <label>Password</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>

        {error && (
          <p style={{ color: "red", marginTop: "10px" }}>{error}</p>
        )}

        <button type="submit" disabled={loading} style={{ marginTop: "15px" }}>
          {loading ? "Logging in..." : "Login"}
        </button>
      </form>
    </div>
  );
}

export default Login;