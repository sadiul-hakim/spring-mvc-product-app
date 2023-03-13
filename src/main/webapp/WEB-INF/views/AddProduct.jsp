<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="Head.jsp"%>
<body>
<%@include file="Navbar.jsp"%>
<h1 class="text-success text-center my-2">Add Product</h1>
<form class="card w-50 mx-auto my-2 p-3" action="addProduct" method="post">
    <div>
        <label for="name">Name : </label><br/>
        <input type="text" name="name" id="name" class="form-control"/>
    </div><br/>
    <div>
        <label for="description">Description : </label><br/>
        <input type="text" name="description" id="description" class="form-control"/>
    </div><br/>
    <div>
        <label for="price">Price : </label><br/>
        <input type="number" name="price" id="price" class="form-control"/>
    </div><br/>
    <button class="btn btn-success" type="submit">Add Product</button>
</form>
</body>
</html>
