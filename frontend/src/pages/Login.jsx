import React, {useState} from 'react';
export default function Login({onLogin}){
  const [u,setU]=useState(''); const [p,setP]=useState('');
  const submit=async e=>{
    e.preventDefault();
    const res = await fetch('/auth/login',{method:'POST',headers:{'Content-Type':'application/json'},body:JSON.stringify({username:u,password:p})});
    if(res.ok){ const data=await res.json(); onLogin(data.token, data.role); } else { alert('Login failed'); }
  }
  return <form onSubmit={submit}><h3>Login</h3>
    <input placeholder="username" value={u} onChange={e=>setU(e.target.value)} /><br/>
    <input placeholder="password" type="password" value={p} onChange={e=>setP(e.target.value)} /><br/>
    <button>Login</button>
  </form>
}
