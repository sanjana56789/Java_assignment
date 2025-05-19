<!DOCTYPE html>
<html>
<head>
    <title>Add Student Marks</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
</head>
<body>
    <h2>Add Student Marks</h2>
    <form action="addMark" method="post">
        Student ID: <input type="number" name="studentId" required /><br/><br/>
        Student Name: <input type="text" name="studentName" required /><br/><br/>
        Subject: <input type="text" name="subject" required /><br/><br/>
        Marks: <input type="number" name="marks" min="0" max="100" required /><br/><br/>
        Exam Date: <input type="date" name="examDate" required /><br/><br/>
        <input type="submit" value="Add Marks" />
    </form>
    <br/>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
