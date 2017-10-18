<%@ page contentType="text/html;charset=UTF-8" %>
<jsp:useBean id="article" class="photogallery.Article" scope="request" />
<!doctype html>
<html>
<head>
    <title>Add</title>
    <link rel="stylesheet" href="../../css/style.css">
</head>
<body>
<div id="wrap">
    <h2>${action}</h2>
    <form action="add.action" method="post" enctype="multipart/form-data">
        <input id="writer" name="writer" placeholder="writer..."
               value="${article.writer}" required class="form">
        <br>
        <input id="title" name="title" placeholder="title..."
               value="${article.title}" required class="form">
        <br>
        <textarea id="content" name="content"
                  required class="form">${article.content}</textarea>
        <br>
        <% if(article.getSaveName() != null) {%>
        <img src="/image.action?<%= article.getSaveName() %>" class="thumb"/>
        <%}%>
        <input id="file" name="file" type="file" placeholder="image file" required>
        <br>
        <input type ="hidden" name="id" value="${article.id}">
        <input type="submit" name="action" value="${action}">
    </form>
</div>
</body>
</html>
