<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Greeting</title>
</head>
<body>
<form:form action="/showPet" modelAttribute="pet">
    <form:label path="name">Enter name of pet:</form:label>
    <form:input path="name"/>
    <form:errors path="name"/><br/>

    <form:label path="species">Select species:</form:label>
    <form:select path="species" items="${allSpecies}"/>
    <form:errors path="species"/>

    <form:label path="food">Select food:</form:label>
    <form:input path="food"/>
    <form:errors path="food"/>

    <input type="submit"/>
</form:form>
</body>
</html>