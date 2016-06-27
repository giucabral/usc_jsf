<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- Placed at the end of the document so the pages load faster --%>
<spring:url value="/vendors/jquery/jquery.min.js" var="jqueryJs"/>
<script src="${jqueryJs}"></script>

<%-- Bootstrap --%>
<spring:url value="/vendors/bootstrap/js/bootstrap.min.js" var="bootstrapJs"/>
<script src="${bootstrapJs}"></script>