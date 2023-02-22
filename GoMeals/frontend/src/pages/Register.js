import React, { useState } from 'react';
import axios from 'axios';

function Register() {
  const [cust_fname, setFname] = useState('');
  const [cust_lname, setLname] = useState('');
  const [cust_address, setAddress] = useState('');
  const [cust_email, setEmail] = useState('');
  const [cust_contact_number, setContactNumber] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    const user = { cust_fname: cust_fname,
                       cust_lname: cust_lname,
                       cust_address:cust_address,
                       cust_email: cust_email,
                       cust_card_details: "Default fake param",
                       cust_contact_number: cust_contact_number };
    axios.post('http://localhost:8080/customer/create', user)
      .then(response => {
        console.log(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Email:
        <input type="email" value={cust_email} onChange={(e) => setEmail(e.target.value)} />
      </label> <label>
        fname:
        <input type="text" value={cust_fname} onChange={(e) => setFname(e.target.value)} />
      </label> <label>
        lname:
        <input type="text" value={cust_lname} onChange={(e) => setLname(e.target.value)} />
      </label> <label>
        address:
        <input type="text" value={cust_address} onChange={(e) => setAddress(e.target.value)} />
      </label> <label>
        phone:
        <input type="text" value={cust_contact_number} onChange={(e) => setContactNumber(e.target.value)} />
      </label>

      <button type="submit">Register</button>
    </form>
  );
}

export default Register;
