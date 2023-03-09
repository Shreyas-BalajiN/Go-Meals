import React from "react";
import { Container, Table } from "react-bootstrap";

function CustomerList(props) {
    return (
        <Container className="my-5 mx-auto customerlist-table">
            <Table>
                <thead>
                    <tr>
                        <th></th>
                        <th>Customer Name</th>
                        <th>Contact Number</th>
                        <th>Meal Count</th>
                    </tr>
                </thead>
                <tbody>
                    {props.customerList.map((customer, index) => {
                        return (
                            <tr key={customer.cust_id}>
                                <td>{index + 1}</td>
                                <td>{customer.cust_fname + " " + customer.cust_lname}</td>
                                <td>{customer.cust_contact_number}</td>
                                <td>12</td>
                            </tr>
                        );
                    })}
                </tbody>
            </Table>
        </Container>

    );
};

export default CustomerList;