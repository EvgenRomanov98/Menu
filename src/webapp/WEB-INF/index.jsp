<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: evrom
  Date: 04.07.2018
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../resources/style/Menu.css">
    <link rel="stylesheet" href="../resources/Icons/css/font-awesome.css">
    <title>TestMenu</title>
</head>
<body>

<header>
    <%--<nav class="dws-menu">--%>
    <%--<ul>--%>
    <%--<li><a href="#"> Гдавная </a></li>--%>
    <%--<li><a href="#"> Продкция </a>--%>
    <%--<ul>--%>
    <%--<li><a href="#"> Одежда </a>--%>
    <%--<ul>--%>
    <%--<li><a href="#">Обувь</a></li>--%>
    <%--<li><a href="#">Куртки</a></li>--%>
    <%--<li><a href="#">брюки</a></li>--%>
    <%--</ul>--%>
    <%--</li>--%>
    <%--<li><a href="#"> Электроника</a>--%>
    <%--<ul>--%>
    <%--<li><a href="#">Камеры</a></li>--%>
    <%--<li><a href="#">Компьютеры</a></li>--%>
    <%--<li><a href="#">Телефоны</a>--%>
    <%--<ul>--%>
    <%--<li><a href="#">Samsung</a></li>--%>
    <%--<li><a href="#">iPhone</a></li>--%>
    <%--<li><a href="#">Fly</a></li>--%>
    <%--</ul>--%>
    <%--</li>--%>
    <%--</ul>--%>
    <%--</li>--%>
    <%--<li><a href="#"> Продукты питания </a></li>--%>
    <%--<li><a href="#"> Инструменты </a></li>--%>
    <%--<li><a href="#"> быт. химия </a></li>--%>
    <%--</ul>--%>
    <%--</li>--%>
    <%--<li><a href="#"> Услуги </a>--%>
    <%--<ul>--%>
    <%--<li><a href="#">Услуга 1</a></li>--%>
    <%--<li><a href="#">Услуга 2</a></li>--%>
    <%--<li><a href="#">Услуга 3</a></li>--%>
    <%--</ul>--%>
    <%--</li>--%>
    <%--<li><a href="#"> Новости </a></li>--%>
    <%--<li><a href="#"> Контакты </a></li>--%>
    <%--</ul>--%>
    <%--</nav>--%>

    <nav class="dws-menu">
        <ul>
            <c:forEach items="${category}" var="category">

                <li><a href="#">${category.title}</a>
                    <ul>

                        <c:forEach items="${category2Level}" var="ca2L">
                            <li><a href="#"> ${ca2L.title} </a></li>
                        </c:forEach>

                        <li><a href="../addCell.jsp">добавить подкатегорию</a></li>

                    </ul>
                </li>

            </c:forEach>

            <li>
                <a href="../add.jsp"> добавить категорию </a>
            </li>
        </ul>

    </nav>
</header>

</body>
</html>


