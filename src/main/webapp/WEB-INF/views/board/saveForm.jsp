<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>


<div class="container">
	<div class="form_cont">
		<form>
			<div class="form-group">
				<label for="title">Title</label>
				<input type="text" name="username" class="form-control" placeholder="Enter title" id="title">
			</div>
			
			<div class="form-group">
				<label for="comment">Content:</label>
				<textarea class="form-control summernote" rows="5" id="content"></textarea>
			</div>
		</form>
		<button type="submit" class="btn btn-primary" id="btn-save">글쓰기 완료</button>
	</div>
</div>

<script>
	$('.summernote').summernote({
        tabsize: 2,
		height: 300
});
</script>
<script src="/js/board.js"></script>
<%@ include file="../layout/footer.jsp"%>
		    
    
