import React, { useState } from "react";
import axios from "axios";
import { Col, Button, Row, Container, Card, Form } from "react-bootstrap";
import { NavLink } from "react-router-dom";

function Login() {
  const [cust_email, setEmail] = useState("");
  const [cust_password, setCustPassword] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    const user = {
      cust_fname: "N/A",
      cust_lname: "N/A",
      cust_address: "N/A",
      cust_email: cust_email,
      cust_card_details: "Default fake param",
      cust_contact_number: "N/A",
      cust_password: cust_password,
    };
    axios
      .post("http://localhost:8080/customer/login", user)
      .then((response) => {
        console.log(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <>
      <div>
        <Container>
          <Row className="vh-100 d-flex justify-content-center align-items-center">
            <Col md={8} lg={6} xs={12}>
              <div className="border border-2 border-primary"></div>
              <Card className="shadow px-4">
                <Card.Body>
                  <div className="mb-3 mt-md-4">
                    <h2 className="fw-bold mb-2 text-center text-uppercase ">
                      Go Meals
                    </h2>
                    <div className="mb-3">
                      <Form onSubmit={handleSubmit}>
                        <Form.Group className="mb-3" controlId="formBasicEmail">
                          <Form.Control
                            type="email"
                            placeholder="Enter email"
                            value={cust_email}
                            onChange={(e) => setEmail(e.target.value)}
                          />
                        </Form.Group>

                        <Form.Group
                          className="mb-3"
                          controlId="formBasicPassword"
                        >
                          <Form.Control
                            type="password"
                            placeholder="Password"
                            value={cust_password}
                            onChange={(e) => setCustPassword(e.target.value)}
                          />
                        </Form.Group>

                        <Form.Group
                          className="mb-3"
                          controlId="formBasicCheckbox"
                        ></Form.Group>
                        <div className="d-grid">
                          <Button variant="primary" type="submit">
                            Login
                          </Button>
                        </div>
                      </Form>
                      <div className="mt-3">
                        <p className="mb-0  text-center">
                          Don't have an account??{" "}
                          {/* <Link to='/register'>Register</Link> */}
                          <NavLink
                            className=""
                            activeClassName="is-active"
                            to="/register"
                            exact
                          >
                            Register
                          </NavLink>
                        </p>
                      </div>
                    </div>
                  </div>
                </Card.Body>
              </Card>
            </Col>
          </Row>
        </Container>
      </div>
    </>
  );
}

export default Login;