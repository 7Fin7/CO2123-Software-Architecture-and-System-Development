<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Greeting</title>
</head>
<body>
<form:form action="/addExercise" modelAttribute="exercise">
    <form:label path="id">ID</form:label>
    <form:input path="id"/>
    <form:errors path="id"/>
    <br/>

    <form:label path="minutes">Minutes</form:label>
    <form:input path="minutes"/>
    <form:errors path="minutes"/>
    <br/>

    <form:label path="activity">Activity</form:label>
    <form:input path="activity"/>
    <form:errors path="activity"/>
    <br/>

    <label>goalId</label><input name="goalId"><br/>
    <input type="submit"/>
</form:form>
</body>
</html>