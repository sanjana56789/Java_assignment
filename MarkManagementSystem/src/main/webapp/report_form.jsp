<!DOCTYPE html>
<html>
<head>
    <title>Reports</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
</head>
<body>
    <h2>Generate Reports</h2>

    <!-- Report 1: Marks above threshold -->
    <form action="generateReport" method="get">
        <h3>Students with Marks Above:</h3>
        <input type="number" name="threshold" min="0" max="100" required />
        <input type="hidden" name="reportType" value="aboveThreshold" />
        <input type="submit" value="Generate" />
    </form>
    <br/>

    <!-- Report 2: Students scored in specific subject -->
    <form action="generateReport" method="get">
        <h3>Students Scored in Subject:</h3>
        <input type="text" name="subject" required />
        <input type="hidden" name="reportType" value="subjectScore" />
        <input type="submit" value="Generate" />
    </form>
    <br/>

    <!-- Report 3: Top N students -->
    <form action="generateReport" method="get">
        <h3>Top N Students:</h3>
        <input type="number" name="topN" min="1" required />
        <input type="hidden" name="reportType" value="topN" />
        <input type="submit" value="Generate" />
    </form>
    <br/>

    <a href="index.jsp">Back to Home</a>
</body>
</html>
