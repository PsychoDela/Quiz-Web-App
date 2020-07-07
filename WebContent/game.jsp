<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="index.css">
    <link href="https://fonts.googleapis.com/css2?family=Acme&display=swap" rel="stylesheet">
    <title>Quiz</title>
</head>

<body>
    <div class="box1">
        <h1 class="heading1">Quiz</h1>
    </div>

    <div class="box2">
        <p>The quiz consists of 10 questions.</p>
        <p>Questions are picked randomly every round.</p>
        <p>Good luck and have fun!</p>
        
        <form action="http://localhost:8080/Quiz-Web-App-v2.0/first-question" method="POST">
            <input type="submit" value="START">
        </form>
    </div>
</body>

</html>