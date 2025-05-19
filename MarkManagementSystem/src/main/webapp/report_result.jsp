<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <title>Report Results</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
</head>
<body>
    <h2>Report Results</h2>

    <c:choose>
        <c:when test="${empty results}">
            <p>No records found.</p>
        </c:when>
        <c:otherwise>
            <table border="1" cellpadding="5" cellspacing="0">
                <tr>
                    <th>Student ID</th>
                    <th>Student Name</th>
                    <th>Subject</th>
                    <th>Marks</th>
                    <th>Exam Date</th>
                </tr>
                <c:forEach var="mark" items="${results}">
                    <tr>
                        <td>${mark.studentId}</td>
                        <td>${mark.studentName}</td>
                        <td>${mark.subject}</td>
                        <td>${mark.marks}</td>
                        <td>${mark.examDate}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>

    <br/>
    <a href="report_form.jsp">Back to Reports</a> | <a href="index.jsp">Home</a>
</body>
</html>
