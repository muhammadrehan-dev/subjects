
<?php

// Step 1: Connect to MySQL database

$conn = new mysqli("localhost", "root", "", "admission");

// Check connection

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$message = "";

// Step 2: Check form submission

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // Get values from HTML form

    $id = isset($_POST["id"]) ? (int)$_POST["id"] : 0;
    $name = isset($_POST["name"]) ? trim($_POST["name"]) : "";

    // Validate input

    if ($id > 0 && $name != "") {

        // Step 3: Insert data into database

        $sql = "INSERT INTO stud_tabble (id, Name) VALUES (?, ?)";

        $stmt = $conn->prepare($sql);

        if ($stmt) {

            $stmt->bind_param("is", $id, $name);

            if ($stmt->execute()) {
                $message = "Student record inserted successfully!";
            } else {
                $message = "Error: " . $stmt->error;
            }

            $stmt->close();

        } else {
            $message = "Error: " . $conn->error;
        }

    } else {
        $message = "Please enter a valid Student ID and Name.";
    }
}

// Step 4: Retrieve student records

$result = $conn->query("SELECT id, Name FROM stud_tabble ORDER BY id");

?>

<!DOCTYPE html>
<html>

<head>

    <title>Student Registration</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            width: 500px;
            margin: 50px auto;
            background-color: white;
            padding: 25px;
            border-radius: 10px;
        }

        h2 {
            text-align: center;
        }

        label {
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 10px 0 15px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            padding: 12px;
            background-color: blue;
            color: white;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background-color: darkblue;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: lightblue;
        }

        .message {
            text-align: center;
            color: green;
            font-weight: bold;
        }

    </style>

</head>

<body>

<div class="container">

    <h2>Student Registration Form</h2>

    <!-- Step 5: HTML Form -->

    <form method="POST" action="">

        <label>Student ID:</label>

        <input type="number"
               name="id"
               placeholder="Enter Student ID"
               min="1"
               required>

        <label>Student Name:</label>

        <input type="text"
               name="name"
               placeholder="Enter Student Name"
               required>

        <button type="submit">Submit</button>

    </form>

    <!-- Display success or error message -->

    <p class="message">
        <?php echo htmlspecialchars($message); ?>
    </p>

    <!-- Step 6: Display Student Records -->

    <h2>Student Records</h2>

    <table>

        <tr>
            <th>Student ID</th>
            <th>Student Name</th>
        </tr>

        <?php

        if ($result && $result->num_rows > 0) {

            while ($row = $result->fetch_assoc()) {

                echo "<tr>";

                echo "<td>" . htmlspecialchars((string)$row["id"]) . "</td>";

                echo "<td>" . htmlspecialchars((string)$row["Name"]) . "</td>";

                echo "</tr>";

            }

        } else {

            echo "<tr>";
            echo "<td colspan='2'>No records found</td>";
            echo "</tr>";

        }

        ?>

    </table>

</div>

</body>

</html>

<?php

// Step 7: Close database connection

$conn->close();

?>
