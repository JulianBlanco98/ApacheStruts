<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>Lista de Libros</title></head>
<body>
<h2>Libros y Autores</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>TITULO</th>
        <th>ISBN</th>
        <th>FECHA PUBLICACION</th>
        <th>GENERO</th>
        <th>NUMERO PAGINAS</th>
        <th>Autor</th>
    </tr>
    <s:iterator value="libros">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="titulo"/></td>
            <td><s:property value="isbn"/></td>
            <td><s:property value="fechaPublicacion"/></td>
            <td><s:property value="genero"/></td>
            <td><s:property value="numeroPaginas"/></td>
            <td><s:property value="autor.nombre"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
