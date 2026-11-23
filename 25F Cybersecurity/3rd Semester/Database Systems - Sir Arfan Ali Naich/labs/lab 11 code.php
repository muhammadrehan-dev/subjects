<?php

$conn = new mysqli(
    "localhost",
    "root",
    "",
    "admission"
);

$sql = "INSERT INTO stud_table (id, name)
        VALUES (2, 'Ali')";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $conn->error;
}

$conn->close();

?>

