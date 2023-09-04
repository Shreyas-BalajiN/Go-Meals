import React, { useState } from 'react'
import { Button, Card, FormGroup, Container, Navbar, Spinner } from 'react-bootstrap';
import axios from "axios";
import { Label, Input } from 'reactstrap';
import CustomerList from './CustomerList';
import { Cookies } from 'react-cookie';
import NavbarComponent from '../components/NavbarComponent';

export default function SupplierDashboard() {
<<<<<<< HEAD
    const [mealchart,showmealchart]=useState(false);
    const [alter,alterstate]=useState("create");
    function handleClick(param){
        console.log(param)
        alterstate(param)
=======

    const [mealchart, showmealchart] = useState(false);
    const [isLoading, setIsLoading] = useState(false);
    const [showCustomerList, setShowCustomerList] = useState(false);
    const [customerList, setCustomerList] = useState([]);
    const [subscriptionList, setSubscriptionList] = useState([]);
    const cookies = new Cookies();
    const loggedInUser = cookies.get('loggedInUser');
    console.log("logged" + loggedInUser);
    const handleClick = () => {
>>>>>>> e197afbdbadeb0e0015aec6c8b6af0104d5b1623
        showmealchart(true);
    };
    const handleCreate = () => {
        const mealChart = [{
            id: {
                day: "monday",
                supId: 2
            },
            item1: document.getElementById("monday1").value,
            item2: document.getElementById("monday2").value,
            item3: document.getElementById("monday3").value,
            item4: document.getElementById("monday4").value,
            item5: document.getElementById("monday5").value,
            specialDate: "2022-02-01"

        },
        {
            id: {
                day: "tuesday",
                supId: 2
            },
            item1: document.getElementById("tuesday1").value,
            item2: document.getElementById("tuesday2").value,
            item3: document.getElementById("tuesday3").value,
            item4: document.getElementById("tuesday4").value,
            item5: document.getElementById("tuesday5").value,
            specialDate: "2022-02-01"

        },
        {
            id: {
                day: "wednesday",
                supId: 2
            },
            item1: document.getElementById("wednesday1").value,
            item2: document.getElementById("wednesday2").value,
            item3: document.getElementById("wednesday3").value,
            item4: document.getElementById("wednesday4").value,
            item5: document.getElementById("wednesday5").value,
            specialDate: "2022-02-01"

        },
        {
            id: {
                day: "thursday",
                supId: 2
            },
            item1: document.getElementById("thursday1").value,
            item2: document.getElementById("thursday2").value,
            item3: document.getElementById("thursday3").value,
            item4: document.getElementById("thursday4").value,
            item5: document.getElementById("thursday5").value,
            specialDate: "2022-02-01"

        },
        {
            id: {
                day: "friday",
                supId: 2
            },
            item1: document.getElementById("friday1").value,
            item2: document.getElementById("friday2").value,
            item3: document.getElementById("friday3").value,
            item4: document.getElementById("friday4").value,
            item5: document.getElementById("friday5").value,
            specialDate: "2022-02-01"

        },
        {
            id: {
                day: "saturday",
                supId: 2
            },
            item1: document.getElementById("saturday1").value,
            item2: document.getElementById("saturday2").value,
            item3: document.getElementById("saturday3").value,
            item4: document.getElementById("saturday4").value,
            item5: document.getElementById("saturday5").value,
            specialDate: "2022-02-01"

        },
        {
            id: {
                day: "sunday",
                supId: 2
            },
<<<<<<< HEAD
            ]
        if(alter=="create") {
            axios
                .post("http://localhost:8080/meal_chart/create", mealChart)
                .then((response) => {
                    console.log(response.data);
                    alert("Data stored");
                    // navigate("/supplierDashboard");
=======
            item1: document.getElementById("sunday1").value,
            item2: document.getElementById("sunday2").value,
            item3: document.getElementById("sunday3").value,
            item4: document.getElementById("sunday4").value,
            item5: document.getElementById("sunday5").value,
            specialDate: "2022-02-01"

        },
        ]
        // item1:
        axios
            .post("http://localhost:8080/meal_chart/create", mealChart)
            .then((response) => {
                console.log(response.data);
                alert("Data stored");
                // navigate("/supplierDashboard");
>>>>>>> e197afbdbadeb0e0015aec6c8b6af0104d5b1623

                })
                .catch((error) => {
                    console.log(error);
                    alert("Data was not sent");
                });
        }
        else{
            axios
                .put("http://localhost:8080/meal_chart/update", mealChart)
                .then((response) => {
                    console.log(response.data);
                    alert("Data stored");
                    // navigate("/supplierDashboard");

                })
                .catch((error) => {
                    console.log(error);
                    alert("Data was not sent");
                    console.log(mealChart)
                });
        }
    };

<<<<<<< HEAD
  return (
    <div>
        <Navbar bg="primary" variant="light">
            <Container>
                <Navbar.Brand href="#home">Go Meals</Navbar.Brand>
                <Nav className="me-auto">
                    <Nav.Link href="#home">Home</Nav.Link>
                    <Nav.Link href="#features">Profile</Nav.Link>
                    <Nav.Link href="#pricing">Customers</Nav.Link>
                </Nav>
            </Container>
        </Navbar>
        <br/>
    <h2 >Welcome Supplier</h2>
        <br/>
    <Button variant="outline-primary"  onClick={handleClick.bind(null,"create")}>Create Meal Chart</Button>{' '}
        <Button variant="outline-primary" onClick={handleClick.bind(null,"update")}>Update Meal Chart</Button>{' '}
        {mealchart &&<div><Card className="mechco">
            <Card.Body>
                <h3>Meal Plan Details</h3>
                <table>
                    <tr>
                        <td>Monday:</td>
                        <td><input type="text" id="monday1" /></td>
                        <td><input type="text" id="monday2" /></td>
                        <td><input type="text" id="monday3" /></td>
                        <td><input type="text" id="monday4" /></td>
                        <td><input type="text" id="monday5" /></td>
                    </tr>
                    <br />
                    <tr>
                        <td>Tuesday:</td>
                        <td><input type="text" id="tuesday1" /></td>
                        <td><input type="text" id="tuesday2" /></td>
                        <td><input type="text" id="tuesday3" /></td>
                        <td><input type="text" id="tuesday4" /></td>
                        <td><input type="text" id="tuesday5" /></td>
                    </tr>
                    <br />
                    <tr>
                        <td>Wednesday:</td>
                        <td><input type="text" id="wednesday1" /></td>
                        <td><input type="text" id="wednesday2" /></td>
                        <td><input type="text" id="wednesday3" /></td>
                        <td><input type="text" id="wednesday4" /></td>
                        <td><input type="text" id="wednesday5" /></td>
                    </tr>
                    <br />
                    <tr>
                        <td>Thursday:</td>
                        <td><input type="text" id="thursday1" /></td>
                        <td><input type="text" id="thursday2" /></td>
                        <td><input type="text" id="thursday3" /></td>
                        <td><input type="text" id="thursday4" /></td>
                        <td><input type="text" id="thursday5" /></td>
                    </tr>
                    <br />
                    <tr>
                        <td>Friday:</td>
                        <td><input type="text" id="friday1" /></td>
                        <td><input type="text" id="friday2" /></td>
                        <td><input type="text" id="friday3" /></td>
                        <td><input type="text" id="friday4" /></td>
                        <td><input type="text" id="friday5" /></td>
                    </tr>
                    <br />
                    <tr>
                        <td>Saturday:</td>
                        <td><input type="text" id="saturday1" /></td>
                        <td><input type="text" id="saturday2" /></td>
                        <td><input type="text" id="saturday3" /></td>
                        <td><input type="text" id="saturday4" /></td>
                        <td><input type="text" id="saturday5" /></td>
                    </tr>
                    <br />
                    <tr>
                        <td>Sunday:</td>
                        <td><input type="text" id="sunday1" /></td>
                        <td><input type="text" id="sunday2" /></td>
                        <td><input type="text" id="sunday3" /></td>
                        <td><input type="text" id="sunday4" /></td>
                        <td><input type="text" id="sunday5" /></td>
                    </tr>
                </table>
                <br/>
                <Button variant="outline-primary" onClick={handleCreate}>Upload</Button>{' '}
            </Card.Body>
=======
    function handleShowCustomers() {
        setIsLoading(true);
        console.log("supId" + JSON.stringify(loggedInUser));
        axios
            .get(`http://localhost:8080/supplier/get/${loggedInUser.supId}`)
            .then((response) => {
                setCustomerList(() => {
                    return response.data.customers;
                });
                setSubscriptionList(response.data.subscriptions);
            })
            .catch((e) => {
                alert("Error getting data" + e)
            })
            .finally(() => {
                setIsLoading(false);
            });
        setShowCustomerList(prevValue => {
            return !prevValue;
        });
    }
>>>>>>> e197afbdbadeb0e0015aec6c8b6af0104d5b1623

    return (
        <div>
            <NavbarComponent />
            <br />
            <h2 >Welcome Supplier</h2>
            <br />
            <Button variant="outline-primary" onClick={handleClick}>Create Meal Chart</Button>{' '}
            <Button variant="outline-primary" onClick={handleShowCustomers}>View Customers</Button>
            {mealchart &&
                <div><Card className="mechco">
                    <Card.Body>
                        <h3>Meal Plan Details</h3>
                        <table>
                            <tr>
                                <td>Monday:</td>
                                <td><input type="text" id="monday1" /></td>
                                <td><input type="text" id="monday2" /></td>
                                <td><input type="text" id="monday3" /></td>
                                <td><input type="text" id="monday4" /></td>
                                <td><input type="text" id="monday5" /></td>
                            </tr>
                            <br />
                            <tr>
                                <td>Tuesday:</td>
                                <td><input type="text" id="tuesday1" /></td>
                                <td><input type="text" id="tuesday2" /></td>
                                <td><input type="text" id="tuesday3" /></td>
                                <td><input type="text" id="tuesday4" /></td>
                                <td><input type="text" id="tuesday5" /></td>
                            </tr>
                            <br />
                            <tr>
                                <td>Wednesday:</td>
                                <td><input type="text" id="wednesday1" /></td>
                                <td><input type="text" id="wednesday2" /></td>
                                <td><input type="text" id="wednesday3" /></td>
                                <td><input type="text" id="wednesday4" /></td>
                                <td><input type="text" id="wednesday5" /></td>
                            </tr>
                            <br />
                            <tr>
                                <td>Thursday:</td>
                                <td><input type="text" id="thursday1" /></td>
                                <td><input type="text" id="thursday2" /></td>
                                <td><input type="text" id="thursday3" /></td>
                                <td><input type="text" id="thursday4" /></td>
                                <td><input type="text" id="thursday5" /></td>
                            </tr>
                            <br />
                            <tr>
                                <td>Friday:</td>
                                <td><input type="text" id="friday1" /></td>
                                <td><input type="text" id="friday2" /></td>
                                <td><input type="text" id="friday3" /></td>
                                <td><input type="text" id="friday4" /></td>
                                <td><input type="text" id="friday5" /></td>
                            </tr>
                            <br />
                            <tr>
                                <td>Saturday:</td>
                                <td><input type="text" id="saturday1" /></td>
                                <td><input type="text" id="saturday2" /></td>
                                <td><input type="text" id="saturday3" /></td>
                                <td><input type="text" id="saturday4" /></td>
                                <td><input type="text" id="saturday5" /></td>
                            </tr>
                            <br />
                            <tr>
                                <td>Sunday:</td>
                                <td><input type="text" id="sunday1" /></td>
                                <td><input type="text" id="sunday2" /></td>
                                <td><input type="text" id="sunday3" /></td>
                                <td><input type="text" id="sunday4" /></td>
                                <td><input type="text" id="sunday5" /></td>
                            </tr>
                        </table>
                        <br />
                        <Button variant="outline-primary" onClick={handleCreate}>Upload</Button>{' '}
                    </Card.Body>
                </Card>
                </div>
            }
            {showCustomerList ?
                (isLoading ? <Container className="my-5 mx-auto"><Spinner variant="primary" /></Container> : <CustomerList customerList={customerList} subscriptionList={subscriptionList} />) : null
            }
            <br />
            <br />
            <Navbar bg="primary" variant="light" className="justify-content-center align-items-center">
                <h3>©Go Meals</h3>
            </Navbar>
        </div>
    );
}