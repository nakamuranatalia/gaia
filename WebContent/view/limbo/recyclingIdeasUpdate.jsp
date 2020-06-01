<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>PROJETO - GAIA</title>
    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v5.12.1/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet" />
    <link href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic" rel="stylesheet" type="text/css" />
    <!-- Third party plugin CSS-->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css" rel="stylesheet" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="../css/styles.css" rel="stylesheet" />
    <link rel="shortcut icon" href="assets/img/shortIcon.png" />
</head>

<body id="page-top">
    <!-- Navigation-->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
        <div class="container">
            <a class="navbar-brand js-scroll-trigger text-white" href="#page-top">GAIA <small>| Coolection Point</small></a><button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive"
                aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>

        </div>
    </nav>
    <!-- Masthead-->
    <header class="recipe_head">
        <div class="container h-100">
            <div class="row h-100 align-items-center justify-content-center text-center">
                <div class="col-lg-10 align-self-start">
                    <h3 class="text-uppercase text-white font-weight-bold">Update the recipe</h3>
                    <hr class="divider my-4" />
                </div>
                <div class="col-lg-8 align-self-start">
                    <form action="RecyclingIdeasUpdate.do" method="post" >
                        <div class="form-row">
                            <div class="form-group col-md-4">
                            </div>
                            <div class="form-group">
                           		<label class="text-white" for="inputAddress">Recycled material name</label>
                            	<input type="text" class="form-control" id="inputAddress" name="name" placeholder="" value="<%=session.getAttribute("recyclingIdeasMaterial") %>" required>
                        	</div>
                        </div>
                        <div class="form-group">
                            <label class="text-white" for="inputAddress">Identifier code</label>
                            <input type="text" class="form-control" id="inputAddress" name="code" placeholder="" value="<%=session.getAttribute("recyclingIdeasCd") %>" required>
                        </div>
                        <div class="form-group">
                            <label class="text-white" for="inputAddress">Title</label>
                            <input type="text" class="form-control" id="inputAddress" name="title" placeholder="" value="<%=session.getAttribute("recyclingIdeasTitle") %>" required>
                        </div>
                        <div class="form-group">
                            <label class="text-white" for="inputAddress2">Ingredients</label>
                            <textarea class="form-control" id="inputAddress2" rows="5" name = "ingredients" required><%=session.getAttribute("recyclingIdeasMaterials") %></textarea>
                        </div>
                     	 <div class="form-group">
                            <label class="text-white" for="inputAddress2">Step by step</label>
                            <textarea class="form-control" id="inputAddress2" rows="20" name = "step" required><%=session.getAttribute("recyclingIdeasSteps") %></textarea>
                        </div>
                        <input type="submit" class="btn btn-primary btn-find" id="btn_find" value="UPDATE">
                    </form>
                </div>
            </div>
        </div>
    </header>

    <!-- Footer-->
    <footer class="bg-light py-5 recipe-footer">
        <div class="container">
            <div class="small text-center text-muted">Copyright © 2020 - Gaia</div>
        </div>
    </footer>
    <!-- Bootstrap core JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <!-- Third party plugin JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
    <!-- Core theme JS-->
    <script src="js/scripts.js"></script>
</body>

</html>