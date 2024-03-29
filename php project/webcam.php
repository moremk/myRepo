
<html>
	<head>
		<title>Webcam</title>
	</head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style>
		#camera{
			margin-left: 380px;
			margin-top: 50px;
			width :200px;
			height:300px;
			border:1px solid black;
		}
		#result{
			width :300px;
			height:300px;
			margin-left: 750px;
			margin-top: -400px;
			
		}
		#button{
			width:350px;
			height:50px;
			margin-left:380px;
		}
		p{
			margin-left: 370px;
			margin-top: 50px;
			color: blue;
			font-size:30px;
		}
	</style>
	<body class="p-3 mb-2 bg-primary-subtle text-emphasis-primary">
		<form class="modal-content animate" action="exam.php" method="GET">
		<p>Take Picture</p>
		<div id="camera"></div>
			<button onclick="take_snapshot()" class="btn btn-primary" id="button">Take Picture</button>
			<div id="result"></div>
		
		
	</body>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/webcamjs/1.0.26/webcam.min.js"></script>
	<script>
		Webcam.set({
			width:350,
			height:350,
			image_format:'jpeg',
			jpeg_quality:90
		})
		Webcam.attach("#camera")

		function take_snapshot(){
			Webcam.snap(function(data_uri){
				document.getElementById('result').innerHTML=
				'<img src="'+data_uri+'"/>';
			});
		}
	
	</script>
</html>