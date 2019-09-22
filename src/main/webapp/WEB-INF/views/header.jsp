<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MarDem
  Date: 15.09.2019
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Header</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <!-- Bootstrap core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="resources/css/mdb.min.css" rel="stylesheet">
    <!-- Your custom styles (optional) -->
    <link href="resources/css/style.css" rel="stylesheet">
</head>
<body>
<!--Navbar -->
<nav class="mb-1 navbar navbar-expand-lg navbar-dark info-color">
    <a href='<c:url value="/"/>' class="navbar-brand">Strona główna</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-4"
            aria-controls="navbarSupportedContent-4" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <c:if test="${userName != null}">
        <div class="collapse navbar-collapse" id="navbarSupportedContent-555">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Dzisiejsze menu</a>
                        <%--TODO link do strony z menu--%>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Kontakt do baby</a>
                        <%--TODO link do strony z kontem--%>
                </li>
            </ul>
            <ul class="navbar-nav ml-auto nav-flex-icons">
                <li class="nav-item">
                    <a class="nav-link waves-effect waves-light">1
                        <i class="fas fa-envelope"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Moje konto</a>
                        <%--TODO link do strony z kontem--%>
                </li>
            </ul>
        </div>
    </c:if>
</nav>
<!--/.Navbar -->
</body>
</html>