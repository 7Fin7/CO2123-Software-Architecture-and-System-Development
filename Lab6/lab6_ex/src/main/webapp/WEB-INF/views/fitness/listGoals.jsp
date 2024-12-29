<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Goals</title>
</head>
<body>

<c:forEach items="${goals}" var="goal">
    <h3>Goal ${goal.id}</h3>
    <c:forEach items="${goal.exercises}" var="exercise">
        <p>${exercise.activity} for ${exercise.minutes} min.</p>
    </c:forEach>
</c:forEach>

</body>
</html>