<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>

<c:forEach items="${goals}" var="goal">
    <c:forEach items="${goal.exercises}" var="exercise">
        <p>${exercise.activity} for ${exercise.minutes} min.</p>
    </c:forEach>
</c:forEach>

</body>
</html>