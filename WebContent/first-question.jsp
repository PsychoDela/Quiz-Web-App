<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Question 1</title>
    <link rel="stylesheet" href="index.css">
    <link href="https://fonts.googleapis.com/css2?family=Acme&display=swap" rel="stylesheet">
</head>

<body>
    <div class="box1">
        <h1 class="heading1">Question 1</h1>
    </div>

    <div class="box2">
        <p>${question}</p>

        <br>

        <form action="" method="POST">
            <input type="text" name="answer1" placeholder="Enter answer here">
            <input type="submit" value="NEXT">
        </form>
    </div>
</body>

</html>