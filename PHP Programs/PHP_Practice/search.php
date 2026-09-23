<?php
//Database connection variables
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "Kavindu_Company";

//Get the name from the form
$name = $_POST['name'];

//Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

//check connection
if ($conn->connect_error) {
	die("Connection failed: " . $conn->connect_error);
}

//SQL query to fetch employee details based on first or last name
$sql = "SELECT * FROM Employee WHERE FirstName = ? OR LastName = ?";
$stmt = $conn->prepare($sql);
$stmt ->bind_param("ss", $name, $name);
$stmt->execute();
$result = $stmt->get_result();

//Display Results
if ($result->num_rows > 0) {
	while ($row = $result->fetch_assoc()) {
	echo "ID: " . $row['ID'] . "<br>";
	echo "First Name: " . $row['FirstName'] . "<br>";
	echo "Last Name: " . $row['LastName'] . "<br>";
	echo "Date of Birth: " . $row['DateOfBirth'] . "<br>";
	echo "Designation: " . $row['Designation'] . "<br>";
	echo "StartDate: " . $row['StartDate'] . "<br>";
	echo "Salary: " . $row['Salary'] . "<br>";
	echo "Branch: " . $row['Branch'] . "<br>";
	}
} else {
	echo "No Employee Records Found with this Name. 🔎🔍";
}

$conn->close();
?>