<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:url var="actionUrl" value="save" />

<form:form id="bookForm" commandName="book" method="post"
	action="${actionUrl }" class="form-horizontal">

	<div class="form-group">
		<label for="name" class="col-xs-4 control-label">Nome</label>
		<div class="col-xs-8">
			<form:input name="customerId" path="name" placeholder="Informe o nome do livro!"
				class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="price" class="col-xs-4 control-label">Preço</label>
		<div class="col-xs-8">
			<form:input path="price" placeholder="Informe o preço do livro!" maxlength="10"
				class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="authors" class="col-xs-4 control-label">Autor(es)</label>
		<div class="col-xs-8">
			<form:input path="authors" placeholder="Informe o(s) Autor(es) do livro!" class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="isbn" class="col-xs-4 control-label">ISBN</label>
		<div class="col-xs-8">
			<form:input path="isbn" placeholder="Informe o ISBN do livro!" class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="publisher" class="col-xs-4 control-label">Editora</label>
		<div class="col-xs-8">
			<form:input path="publisher" placeholder="Informe o Editor do livro!" class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="publishedOn" class="col-xs-4 control-label">Publicação</label>
		<div class="col-xs-8">
			<form:input path="publishedOn" placeholder="YYYY-MM-DD"
				class="datepicker form-control" />
		</div>
	</div>

	<form:input path="id" type="hidden" />
</form:form>