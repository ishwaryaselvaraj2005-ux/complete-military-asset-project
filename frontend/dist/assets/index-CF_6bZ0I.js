const API_BASE_URL = import.meta.env.VITE_API_URL;
// OR (CRA project na)
// const API_BASE_URL = process.env.REACT_APP_API_URL;

async function login(username, password) {
  const response = await fetch(`${API_BASE_URL}/auth/login`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({
      username: username,
      password: password
    })
  });

  if (!response.ok) {
    throw new Error("Login failed");
  }

  const data = await response.json();

  // token save
  localStorage.setItem("token", data.token);
  localStorage.setItem("role", data.role);

  return data;
}

// Example button handler
document.getElementById("loginBtn")?.addEventListener("click", async () => {
  const username = document.getElementById("username").value;
  const password = document.getElementById("password").value;

  try {
    await login(username, password);
    alert("Login success");
  } catch (e) {
    alert("Login failed");
  }
});