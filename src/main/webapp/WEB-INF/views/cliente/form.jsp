<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form action="form" commandName="cliente">
    <form:hidden path="id" />

    <fieldset>
        <div class="form-row">
            <label for="nome">Nome:</label>
            <span class="input"><form:input path="nome" /></span>
        </div>       
        <div class="form-row">
            <label for="descricao">Descrição:</label>
            <span class="input"><form:input path="descricao" /></span>
        </div>
        <div class="form-buttons">
            <div class="button"><input name="submit" type="submit" value="Salvar" /></div>
        </div>
    </fieldset>
</form:form>