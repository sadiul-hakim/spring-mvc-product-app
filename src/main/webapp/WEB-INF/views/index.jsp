<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<%@include file="Head.jsp"%>
<body>
<%@include file="Navbar.jsp"%>
<h1 class="text-success text-center my-2">Product List</h1>
<div class="w-75 mx-auto my-3">
    <table class="table">
        <thead class="table-success">
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.name}</td>
                    <td>${product.description}</td>
                    <td>${product.price}</td>
                    <td>
                        <a href="/MvcCrud_war_exploded/deleteProduct/${product.id}">
                        <i class="fa fa-trash text-danger"></i>
                        </a>
                        <a href="/MvcCrud_war_exploded/updateProductPage/${product.id}">
                            <i class="fa fa-pencil-square text-primary"></i>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
