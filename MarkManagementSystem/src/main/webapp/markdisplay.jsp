<!DOCTYPE html>
<html>
<head>
    <title>Display Student Marks</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
</head>
<body>
    <h2>Display Student Marks</h2>
    <form action="displayMarks" method="get">
        Search by Student ID: <input type="number" name="studentId" />
        <input type="submit" value="Search" />
    </form>
    <br/>
    <form action="displayMarks" method="get">
        <input type="hidden" name="all" value="true" />
        <input type="submit" value="Show All Records" />
    </form>
    <br/>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
