import React, { useEffect, useState } from "react";
import axios from "axios";
import { Spinner } from "react-bootstrap";

function CustomerProfile() {
    const [customer, setCustomer] = useState({});
    const [isLoading, setIsLoading] = useState(false);

    useEffect(() => {
        setIsLoading(true);
        axios
            .get("http://localhost:8080/customer/get/4")
            .then((response) => {
                setCustomer(() => {
                    return response.data;
                });
            })
            .catch((e) => {
                alert("Error getting data" + e)
            })
            .finally(() => {
                setIsLoading(false);
            });
    }, []);

    return (
        isLoading ? <Spinner /> :
            (
                <div className="customer-profile">
                    <div className="row mb-2">
                        <div className="col-lg-8">
                            <h2 className="d-inline">Hi, </h2>
                            <h2 className="d-inline">{customer.cust_fname + " " + customer.cust_lname}</h2>
                        </div>
                    </div>
                    <div className="row mb-2">
                        <div className="col-lg-8">
                            <h4 className="d-inline">Email: </h4>
                            <h4 className="d-inline">{customer.cust_email}</h4>
                        </div>
                    </div>
                    <div className="row mb-2">
                        <div className="col-lg-8">
                            <h4 className="d-inline">Address: </h4>
                            <h4 className="d-inline">{customer.cust_address}</h4>
                        </div>
                    </div>
                    <div className="row mb-2">
                        <div className="col-lg-8">
                            <h4 className="d-inline">Contact number: </h4>
                            <h4 className="d-inline">{customer.cust_contact_number}</h4>
                        </div>
                    </div>
                </div>
            )
    );
}

export default CustomerProfile;