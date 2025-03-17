<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Greeting</title>
</head>
<body>

<!-- The form:form tag generates a Spring MVC form -->
<form:form action="/showPet" modelAttribute="pet">
    <form:label path="name">Enter name of pet:</form:label>
    <form:input path="name"/>
    <form:errors path="name"/><br/>     <!-- Displays validation errors for the 'name' field, if any -->

    <form:label path="species">Select species:</form:label>
    <form:select path="species" items="${allSpecies}"/>
    <form:errors path="species"/>       <!-- Displays validation errors for the 'species' field, if any -->

    <form:label path="food">Select food:</form:label>
    <form:input path="food"/>
    <form:errors path="food"/>      <!-- Displays validation errors for the 'food' field, if any -->

    <input type="submit"/>
</form:form>

</body>
</html>