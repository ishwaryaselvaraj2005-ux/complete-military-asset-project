import React, { useState, useEffect } from 'react';
import Login from './pages/Login';
import Dashboard from './pages/Dashboard';

export default function App(){
  const [token, setToken] = useState(localStorage.getItem('token') || null);
  const [role, setRole] = useState(localStorage.getItem('role') || null);

  if(!token) return <Login onLogin={(t,r)=>{setToken(t); setRole(r); localStorage.setItem('token', t); localStorage.setItem('role', r);}} />;

  return <div style={{padding:20}}>
    <h2>Military Asset Management - Demo UI</h2>
    <p>Role: {role} <button onClick={()=>{localStorage.clear(); location.reload();}}>Logout</button></p>
    <Dashboard token={token} />
  </div>
}
