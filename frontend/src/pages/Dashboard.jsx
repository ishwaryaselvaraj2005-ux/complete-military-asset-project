import React, {useEffect, useState} from 'react';
export default function Dashboard({token}){
  const [bases,setBases]=useState([]);
  useEffect(()=>{
    fetch('/api/bases',{headers:{Authorization:'Bearer '+token}})
      .then(r=>r.json()).then(setBases).catch(e=>console.error(e));
  },[]);
  return <div>
    <h3>Bases</h3>
    <ul>{bases.map(b=> <li key={b.id}>{b.name} - {b.location}</li>)}</ul>
    <h4>Quick Actions</h4>
    <p>Use API endpoints to create purchases, transfers, assignments (this is a demo UI).</p>
  </div>
}
