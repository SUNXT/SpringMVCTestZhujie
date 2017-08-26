<%--
  Created by IntelliJ IDEA.
  User: sunxuedian
  Date: 2017/8/21
  Time: 下午12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save Product</title>
</head>
<body>
    <div id="mainDiv">
        <h4>The product has saved!</h4>
        <p>
            <h5>Product detail: </h5>
            Product Name: ${product.name}<br/>
            Product Description: ${product.description}<br/>
            Product Price: ${product.price}<br/>
        </p>
    </div>
</body>
</html>
