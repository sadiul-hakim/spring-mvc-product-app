<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<%@include file="Head.jsp"%>
<body>
<%@include file="Navbar.jsp"%>

<form class="card w-50 mx-auto my-2 p-3" action="/MvcCrud_war_exploded/updateProduct" method="post">
  <div>
    <input type="hidden" name="id" class="form-control" value="${product.id}"/>
  </div><br/>
  <div>
    <label for="name">Name : </label><br/>
    <input type="text" name="name" id="name" class="form-control" value="${product.name}"/>
  </div><br/>
  <div>
    <label for="description">Description : </label><br/>
    <input type="text" name="description" id="description" class="form-control" value="${product.description}"/>
  </div><br/>
  <div>
    <label for="price">Price : </label><br/>
    <input type="text" name="price" id="price" class="form-control" value="${product.price}"/>
  </div><br/>
  <button class="btn btn-success" type="submit">Update Product</button>
</form>

</body>
</html>
