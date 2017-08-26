<%--
  Created by IntelliJ IDEA.
  User: sunxuedian
  Date: 2017/8/21
  Time: 上午11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product From</title>
</head>
<body>
    <div id="mainDiv">
        <form action="product_save" method="post">
            <fieldset>
                <legend>Add a product</legend>
                <label for="name">Product Name: </label>
                <input type="text" id="name" name="name" value="" tabindex="1">
                <label for="description">Description: </label>
                <input type="text" id="description" name="description" tabindex="2">
                <label for="price">Product Price: </label>
                <input type="text" id="price" name="price" tabindex="3">
                <div id="buttons">
                    <input id="reset" type="reset" value="重置" tabindex="4">
                    <input id="submit" type="submit" value="添加" tabindex="5">
                </div>
            </fieldset>
        </form>
    </div>
</body>
</html>
