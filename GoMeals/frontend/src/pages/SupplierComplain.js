import React, { useState, useEffect } from "react";
import { Cookies } from "react-cookie";
import axios from "axios";
import { Container, Table, Modal, Button, Form, Spinner } from "react-bootstrap";
import NavbarComponent from "../components/NavbarComponent";

export default function SupplierComplain() {
    const cookies = new Cookies();
    const loggedInUser = cookies.get('loggedInUser');
    const [isLoading, setIsLoading] = useState(false);
    const [complains, setComplains] = useState([]);
    const [selectedComplainIndex, setSelectedComplainIndex] = useState(0);
    const [supplierComment, setSupplierComment] = useState("");
    const [showComplainDetail, setShowComplainDetail] = useState(false);

    useEffect(() => {
        // http://localhost:8080/complain/get/all-supplier/${loggedInUser.supId}
        setIsLoading(true);
        axios
            .get("http://localhost:8080/complain/get/all-supplier/3")
            .then((response) => {
                setComplains(response.data);
            })
            .catch((e) => {
                alert("Error getting data" + e)
            })
            .finally(() => {
                setIsLoading(false);
            });
    }, []);

    function handleComplain(index) {
        console.log("iii" + index);
        setSelectedComplainIndex(index);
        console.log(selectedComplainIndex);
        console.log("settttt");
        setSupplierComment(complains[index].supplierComment);
        console.log(supplierComment);

        console.log("ss" + supplierComment);
        setShowComplainDetail(true);
    }

    const submitFeedback = () => {
        if (supplierComment.trim().length === 0) {
            alert("Please insert feedback.");
            return;
        }
        setIsLoading(true);
        if (complains.length !== 0 && complains[selectedComplainIndex].status !== "Initiated") {
            complains[selectedComplainIndex].supplierComment = supplierComment;
            complains[selectedComplainIndex].status = "Resolved";
        }
        axios
            .put("http://localhost:8080/complain/update", complains[selectedComplainIndex])
            .catch((e) => {
                alert("Error submitting feedback" + e)
            })
            .finally(() => {
                setIsLoading(false);
                setShowComplainDetail(false);
            });
    }

    console.log(complains[0]?.supplierId);

    return (
        <div>
            {/* <NavbarComponent /> */}
            <Modal show={showComplainDetail} onHide={() => setShowComplainDetail(false)}>
                <Modal.Header closeButton>
                    <Modal.Title>Complain</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                    {isLoading ? (<Spinner />) :
                        <Form>
                            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
                                <Form.Label>Complain Date</Form.Label>
                                <Form.Control
                                    type="email"
                                    value={complains[selectedComplainIndex]?.date}
                                    disabled
                                    autoFocus
                                />
                            </Form.Group>
                            <Form.Group
                                className="mb-3"
                                controlId="exampleForm.ControlTextarea1"
                            >
                                <Form.Label>Customer Comment</Form.Label>
                                <Form.Control as="textarea" rows={3} value={complains[selectedComplainIndex]?.customerComment} disabled />
                            </Form.Group>
                            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
                                <Form.Label>Complain Date</Form.Label>
                                <Form.Control
                                    type="Complain Status"
                                    value={complains[selectedComplainIndex]?.status}
                                    disabled
                                    autoFocus
                                />
                            </Form.Group>
                            <Form.Group
                                className="mb-3"
                                controlId="exampleForm.ControlTextarea1"
                            >
                                <Form.Label>Your Feedback</Form.Label>
                                <Form.Control as="textarea" rows={4} value={supplierComment} onChange={(e) => setSupplierComment(e.target.value)} disabled={complains[selectedComplainIndex]?.status === "Initiated" ? false : true} />
                            </Form.Group>
                        </Form>
                    }
                </Modal.Body>
                <Modal.Footer>
                    <Button variant="secondary" onClick={() => setShowComplainDetail(false)}>
                        Close
                    </Button>
                    <Button variant="primary" onClick={submitFeedback} >
                        Save Changes
                    </Button>
                </Modal.Footer>
            </Modal>

            <Container className="my-5 mx-xs-2 mx-auto customerlist-table">
                <Table>
                    <thead>
                        <tr>
                            <th></th>
                            <th>Complain Date</th>
                            <th>Complain Comment</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        {complains?.map((complain, index) => {
                            return (
                                <tr key={complain.complainId} onClick={() => handleComplain(index)}>
                                    <td>{index + 1}</td>
                                    <td>{complain.date}</td>
                                    <td>{complain.customerComment}</td>
                                    <td>{complain.status}</td>
                                </tr>
                            );
                        })}
                    </tbody>
                </Table>
                {/* {
                    showComplainDetail &&
                    <Modal.Dialog>
                        <Modal.Header closeButton>
                            <Modal.Title>Modal title</Modal.Title>
                        </Modal.Header>

                        <Modal.Body>
                            <p>Modal body text goes here.</p>
                        </Modal.Body>

                        <Modal.Footer>
                            <Button variant="secondary" onClick={() => { setShowComplainDetail(false); }}>Close</Button>
                            <Button variant="primary">Save changes</Button>
                        </Modal.Footer>
                    </Modal.Dialog>
                } */}
            </Container>
        </div>
    );
}