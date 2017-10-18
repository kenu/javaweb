<%@ page import="photogallery.Article" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Photo Gallery List</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div id="wrap">

    <h2>Photo Gallery</h2>
    ${param.test }

    <table>
        <tr>
            <th>Writer</th>
            <th>Title</th>
            <th>Content</th>
        </tr>
        <%
            List<Article> list = (List<Article>)request.getAttribute("list");
            for (Article article : list) {
        %>
        <tr>
            <td class="writer"><%= article.getWriter() %>
            </td>
            <td class="title"><a href="add.action?id=<%= article.getId() %>"><%= article.getTitle() %>
            </a></td>
            <td class="content"><%= article.getContent() %>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <%= article.getContent() %>
                <br>
                <img src="/image.action?<%= article.getSaveName() %>" class="thumb"/>
            </td>
        </tr>
        <%
            }
            if (list.size() == 0) {
        %>
        <tr>
            <td colspan="3">empty
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <a href="add.action">Add</a>
</div>

</body>
</html>
