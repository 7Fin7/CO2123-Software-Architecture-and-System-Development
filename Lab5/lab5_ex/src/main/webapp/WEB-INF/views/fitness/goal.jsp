<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
</head>
<body>

<form:form action="/addGoal" modelAttribute="goal">
    <form:label path="id">ID:</form:label>
    <form:input path="id"/>

    <form:label path="minutes">Minutes:</form:label>
    <form:input path="minutes"/>


    <label>exerciseDesc:</label>
    <input name="exerciseDesc"/>

    <input type="submit"/>
</form:form>

</body>
</html>