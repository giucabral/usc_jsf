<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="pt-br">
<%@ include file="/WEB-INF/views/fragments/head.jsp" %>
<body>

<div class="container">

    <spring:url value="/clientes/form" var="clientesFormActionUrl"/>

    <form:form class="form-horizontal" method="post" modelAttribute="cliente" action="${clientesFormActionUrl}">

        <form:hidden path="id"/>

        <spring:bind path="nome">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Nome</label>
                <div class="col-sm-10">
                    <form:input path="nome" type="text" class="form-control" id="nome" placeholder="Nome"/>
                    <form:errors path="nome" class="control-label"/>
                </div>
            </div>
        </spring:bind>

        <spring:bind path="descricao">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="col-sm-2 control-label">Descrição</label>
                <div class="col-sm-10">
                    <form:textarea path="descricao" class="form-control" id="descricao" placeholder="Descrição"/>
                    <form:errors path="descricao" class="control-label"/>
                </div>
            </div>
        </spring:bind>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn-lg btn-primary pull-right">Salvar</button>
            </div>
        </div>
    </form:form>

</div><!-- /.container -->
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>

</body>
</html>
