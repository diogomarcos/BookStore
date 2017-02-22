<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Livros Cadastrados</title>

<link rel="stylesheet"
	href='<c:url value="/web-resources/lib/bootstrap-3.3.6/css/bootstrap.min.css"/>'>
	
<link rel="stylesheet"
	href='<c:url value="/web-resources/lib/jquery/jquery-ui-1.10.4.custom.css"/>'>

<style type="text/css">
th {
	text-align: left
}
</style>


</head>

<body>
	<div style="width: 95%; margin: 0 auto;">

		<div id="bookDialog" style="display: none;">
			<%@ include file="bookForm.jsp"%>
		</div>

		<h1>Livros Cadastrados</h1>

		<button class="btn btn-primary" onclick="addBook()">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Adcionar novo livro
		</button>
		<br>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th width="4%">Ordem</th>
					<th width="12%">Nome</th>
					<th width="12%">Preço</th>
					<th width="12%">Autor(es)</th>
					<th width="12%">ISBN</th>
					<th width="12%">Editora</th>
					<th width="12%">Publicação</th>
					<th width="12%">Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${bookList}" var="book" varStatus="loopCounter">
					<tr>
						<td><c:out value="${loopCounter.count}" /></td>
						<td><c:out value="${book.name}" /></td>
						<td><c:out value="${book.price}" /></td>
						<td><c:out value="${book.authors}" /></td>
						<td><c:out value="${book.isbn}" /></td>
						<td><c:out value="${book.publisher}" /></td>
						<td><c:out value="${book.publishedOn}" /></td>

						<td><nobr>
								<button class="btn btn-primary"
									onclick="editBook(${book.id});">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Editar
								</button>

								<a class="btn btn-primary"
									onclick="return confirm('Deseja realmente excluir esse livro?');"
									href="delete/${book.id}"> 
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Excluir
								</a>

							</nobr></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

	<!--  It is advised to put the <script> tags at the end of the document body so they don't block rendering of the page -->
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery-1.10.2.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery-ui-1.10.4.custom.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery.ui.datepicker.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/bootstrap-3.3.6/js/bootstrap.min.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/js-for-listBooks.js"/>'></script>
</body>
</html>