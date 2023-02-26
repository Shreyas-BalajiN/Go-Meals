import React, {useState} from 'react'
import {Button,Card,Col,FormGroup,Container,Row,Form} from 'react-bootstrap';
import axios from "axios";
import{Label,Input} from 'reactstrap';

export default function SupplierDashboard() {
    const [mealchart,showmealchart]=useState(false);
    const handleClick=()=>{
        showmealchart(true);
    };
    const handleCreate=()=> {
        const mealChart = {
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

        };
// item1:
        axios
            .post("http://localhost:8080/meal_chart/create", mealChart)
            .then((response) => {
                console.log(response.data);
                alert("Data stored");
                // navigate("/supplierDashboard");

            })
            .catch((error) => {
                console.log(error);
                alert("Data was not sent");
            });
    };

  return (
    <div>
        <br/>
        <br/>
    <h2 >SupplierDashboard</h2>
        <br/>
        <br/>
    <Button variant="outline-primary" onClick={handleClick}>Create Meal Chart</Button>{' '}
        {mealchart &&<div><Card className="mechco">
            <Card.Body>
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
            </Card.Body>
        </Card>
        <br/>
            <br/>
            <button onClick={handleCreate}>Create</button>
        </div>

        }
    </div>
  );
}
