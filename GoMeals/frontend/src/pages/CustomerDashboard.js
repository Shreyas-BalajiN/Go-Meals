import React, {useEffect, useState} from 'react'
import {Button, Card, Container, Nav, Navbar} from "react-bootstrap";
import axios from "axios";
import food from "../resources/food.jpg"
import {Modal} from "react-bootstrap";
import { Container, Nav, Navbar } from "react-bootstrap";
import NavbarComponent from "../components/NavbarComponent";

export default function CustomerDashboard(children, func) {
    const [data,setdata]=useState({});
    const [datamon, setdatamon] = useState({});
    const [datatue, setdatatue] = useState({});
    const [datawed, setdatawed] = useState({});
    const [datathu, setdatathu] = useState({});
    const [datafri, setdatafri] = useState({});
    const [datasat, setdatasat] = useState({});
    const [datasun, setdatasun] = useState({});
    const [show, setShowModal] = useState(false);
    const[mealchart,setMealChart]=useState({});
    const[supName, setSupName]=useState("");
    const fetchdata = () => {
        axios.get("http://localhost:8080/supplier/get/all")
            .then((response) => {
                setdata(response.data)
            })
    }
    useEffect(() => {
        fetchdata()
    }, []);

    const handleClick=(param, e)=>{
        const id=param;
        axios.get(`http://localhost:8080/supplier/get/${id}`)
            .then((response) => {
                setSupName(response.data)
            })
        const data1 = { day: "monday", supId: param };
        axios.post("http://localhost:8080/meal_chart/get",data1)
            .then((response) => {
                setdatamon(response.data);

            })
        const data2 = { day: "tuesday", supId: param };
        axios.post("http://localhost:8080/meal_chart/get",data2)
            .then((response) => {
                setdatatue(response.data);

            })
        const data3 = { day: "wednesday", supId: param };
        axios.post("http://localhost:8080/meal_chart/get",data3)
            .then((response) => {
                setdatawed(response.data);

            })
        const data4 = { day: "thursday", supId: param };
        axios.post("http://localhost:8080/meal_chart/get",data4)
            .then((response) => {
                setdatathu(response.data);

            })
        const data5 = { day: "friday", supId: param };
        axios.post("http://localhost:8080/meal_chart/get",data5)
            .then((response) => {
                setdatafri(response.data);

            })
        const data6 = { day: "saturday", supId: param };
        axios.post("http://localhost:8080/meal_chart/get",data6)
            .then((response) => {
                setdatasat(response.data);

            })
        const data7 = { day: "sunday", supId: param };
        axios.post("http://localhost:8080/meal_chart/get",data7)
            .then((response) => {
                setdatasun(response.data);

            })
        console.log(param)
        setShowModal(!show);
    }
    const handleClose=()=>{
        setShowModal(false);
    }
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
            <h1>Welcome to GO-Meals</h1>
            <br/>
            <br/>
            <h3>Vendors in your city</h3>
            <br />
            <div className="containers">
                <div className="card-containers">
                    { Object.keys(data).map((key) => (
                        <Card style={{ width: '18rem' }}>
                            <Card.Img variant="top" src={food}/>
                            <Card.Body>
                                <Card.Title>{data[key].supName}</Card.Title>
                                <Card.Text>
                                    Some quick example text to build on the card title and make up the
                                    bulk of the card's content.
                                </Card.Text>
                                <Button variant="primary" onClick={handleClick.bind(this,data[key].supId)}>Details</Button>
                            </Card.Body>
                        </Card>

                    ))}
                </div>
            </div>
            {show&&<Modal size="xl" show={show} onHide={handleClose}>
                <Modal.Header closeButton>
                    <Modal.Title>{supName.supName} is offering the following Meal plan</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                    <h3>Monday: {datamon.item1}, {datamon.item2}, {datamon.item3}, {datamon.item4}, {datamon.item5}</h3><br />
                    <h3>Tuesday: {datatue.item1}, {datatue.item2}, {datatue.item3}, {datatue.item4}, {datatue.item5}</h3><br/>
                    <h3>Wednesday: {datawed.item1}, {datawed.item2}, {datawed.item3}, {datawed.item4}, {datawed.item5}, </h3><br/>
                    <h3>Thursday: {datathu.item1}, {datathu.item2}, {datathu.item3}, {datathu.item4}, {datathu.item5}, </h3><br/>
                    <h3>Friday: {datafri.item1}, {datafri.item2}, {datafri.item3}, {datafri.item4}, {datafri.item5}, </h3><br/>
                    <h3>Saturday: {datasat.item1}, {datasat.item2}, {datasat.item3}, {datasat.item4}, {datasat.item5}, </h3><br/>
                    <h3>Sunday: {datasun.item1}, {datasun.item2}, {datasun.item3}, {datasun.item4}, {datasun.item5}, </h3><br/>
                </Modal.Body>
                <Modal.Footer>
                    <Button variant="secondary">Subscribe</Button>
                    <Button variant="secondary" onClick={handleClick}>Close</Button>
                </Modal.Footer>
            </Modal>}
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>


            {/*<Navbar bg="primary" variant="light" className="justify-content-center align-items-center" >*/}
            {/*  <h3>©Go Meals</h3>*/}
            {/*</Navbar>*/}
        </div>

    )
}

