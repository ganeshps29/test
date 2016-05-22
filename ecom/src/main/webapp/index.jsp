<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
   
  </style>
</head>
<body>

<table align="center">
<tr>
<td>
<div class="right">
  <a href="login"><button type="button" class="btn btn-success">Login</button></a>
  <a href="registration"><button type="button" class="btn btn-success">Registration</button></a>
</div>
</td>
</tr>
<tr>
<td>
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src=<c:url value="/repository/imge/banner1.jpg"/> alt="Chania" width="460" height="345">
      </div>

      <div class="item">
        <img src=<c:url value="/repository/imge/banner1.jpg"/> alt="Chania" width="460" height="345">
      </div>
    
     <div class="item">
        <img src=<c:url value="/repository/imge/banner1.jpg"/> alt="Flower" width="460" height="345">
      </div>

      <div class="item">
        <img src=<c:url value="/repository/imge/banner1.jpg"/> alt="Flower" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</td></tr>
<tr>
<td>
<div>
  <div class="row">
   <div class="col-sm-2"><a href="productsInfo?name=img1"><img src=<c:url value="/repository/imge/banner1.jpg"/> class="img-thumbnail" alt="Flower" width="350" height="950"></a></div>
   <div class="col-sm-2"><a href="registration"><a href="productsInfo?name=img1"><img src=<c:url value="/repository/imge/banner2.jpg"/> class="img-thumbnail" alt="Flower" width="350" height="950"></a></div>
   <div class="col-sm-2"><a href="registration"><a href="productsInfo?name=img1"><img src=<c:url value="/repository/imge/3.jpg"/> class="img-thumbnail" alt="Flower" width="350" height="950"></a></div>
    
  </div>
</div>
<div>
<a href="productsInfo?name=all">All Products</a>
</div>
</td>
</tr>
</table>
</body>

</html>
