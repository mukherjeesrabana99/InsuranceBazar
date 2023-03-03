<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html class="no-js" lang="zxx">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>View Jobs</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="manifest" href="site.webmanifest">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

        <!-- CSS here -->
        <link rel="stylesheet" href="css/style-car.css">
        <link rel="stylesheet" href="./css/jobdiv.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <link rel="stylesheet" href="css/jobdetail.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/octicons/8.5.0/octicons.min.css">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Nunito:wght@600;700;800&display=swap" rel="stylesheet">
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
        <!-- Icon Font Stylesheet -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Template Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
        <link rel="stylesheet" href="WEB-INF/css/style.css" type="text/css"/>
        <link rel="stylesheet" href="WEB-INF/css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="WEB-INF/lib/owlcarousel/assets/owl.carousel.css" type="text/css"/>



        <link href="css/stylenav.css" rel="stylesheet">
    </head>

    <body>
        
        <section>
           
        </section>
<!--        <div class="top-banner">
                <div class="container" style="background-color:#9ec645">
                    <div class="small-bold-text banner-text"></div>
                </div>
            </div>
            <hr>
             <div class="top-banner">
                <div class="container" style="background-color:#9ec645">
                    <div class="small-bold-text banner-text">CLAIM YOUR FNOL</div>
                </div>
            </div>  -->
        

<!--          <div class="container-2">
  <div class="item">
      <<img src="https://img.freepik.com/free-vector/privacy-policy-concept-illustration_114360-7478.jpg?w=740&t=st=1677772922~exp=1677773522~hmac=d1d11ee5f8add265fddaba977f8a22d3680b842d7d2814799d5a6009b82f36ce" alt="alt"/>
  </div>-->
          <div class="formbold-main-wrapper">
  <!-- Author: FormBold Team -->
  <!-- Learn More: https://formbold.com -->
  <div class="formbold-form-wrapper">
    <form action="FileFnol?claimId=${Claim.getClaimId()}" method="POST">
        <div class="formbold-input-flex">
          <div>
              <input
              type="text"
              name="fullName"
              value="${User.getFullName()}"
              id="firstname"
              placeholder=""
              class="formbold-form-input"
              />
              <label for="firstname" class="formbold-form-label"> Full Name </label>
          </div>
            <div>
              <input
              
              name="email"
              value="${User.getEmail()}"
              id="email"
              placeholder=""
              class="formbold-form-input"
              />
              <label for="email" class="formbold-form-label"> Mail </label>
          </div>
          
        </div>

        <div class="formbold-input-flex">
            
          
          
            
            <div class="form-holder">
                   <input
              
              name="email"
              value="${Claim.getBikeNumber()}"
              id="email"
              placeholder=""
              class="formbold-form-input"
              />
              <label for="email" class="formbold-form-label"> Bike Number </label>
                                        
                                        
                                    </div>
           
        </div>
              <div class="formbold-input-flex">
            
          
          
            
            <div class="form-holder">
                   <input
              
              name="email"
              value="${Claim.getBikeMake()}"
              id="email"
              placeholder=""
              class="formbold-form-input"
              />
              <label for="email" class="formbold-form-label"> Bike Make </label>
                                        
                                        
                                    </div>
           
        </div>
              <div class="formbold-input-flex">
            
          
          
            
            <div class="form-holder">
                   <input
              
              name="email"
              value="${Claim.getBikeModel()}"
              id="email"
              placeholder=""
              class="formbold-form-input"
              />
              <label for="email" class="formbold-form-label"> Bike Model </label>
                                        
                                        
                                    </div>
           
        </div>
              <div class="formbold-input-flex">
            
          
          
            
            <div class="form-holder">
                   <input
              
              name="email"
              value="${Claim.getBikeRegistrationYear()}"
              id="email"
              placeholder=""
              class="formbold-form-input"
              />
              <label for="email" class="formbold-form-label"> Bike Registration Year </label>
                                        
                                        
                                    </div>
           
        </div>
        
        

        <div class="formbold-textarea">
            <textarea
                rows="6"
                name="message"
                id="message"
                placeholder="Write your message..."
                class="formbold-form-input"
            ></textarea>
            <label for="message" class="formbold-form-label"> Message </label>
        </div>

        <div class="formbold-input-file">
          <div class="formbold-filename-wrapper">
            <span class="formbold-filename">
              website-information-architecture.pdf

              <svg width="18" height="18" viewBox="0 0 18 18" fill="none" xmlns="http://www.w3.org/2000/svg">
              <g clip-path="url(#clip0_1670_1541)">
              <path d="M9.00005 7.93906L12.7126 4.22656L13.7731 5.28706L10.0606 8.99956L13.7731 12.7121L12.7126 13.7726L9.00005 10.0601L5.28755 13.7726L4.22705 12.7121L7.93955 8.99956L4.22705 5.28706L5.28755 4.22656L9.00005 7.93906Z" fill="#536387"/>
              </g>
              <defs>
              <clipPath id="clip0_1670_1541">
              <rect width="18" height="18" fill="white"/>
              </clipPath>
              </defs>
              </svg>
            </span>

            <span class="formbold-filename">
              website-logo.png

              <svg width="18" height="18" viewBox="0 0 18 18" fill="none" xmlns="http://www.w3.org/2000/svg">
              <g clip-path="url(#clip0_1670_1541)">
              <path d="M9.00005 7.93906L12.7126 4.22656L13.7731 5.28706L10.0606 8.99956L13.7731 12.7121L12.7126 13.7726L9.00005 10.0601L5.28755 13.7726L4.22705 12.7121L7.93955 8.99956L4.22705 5.28706L5.28755 4.22656L9.00005 7.93906Z" fill="#536387"/>
              </g>
              <defs>
              <clipPath id="clip0_1670_1541">
              <rect width="18" height="18" fill="white"/>
              </clipPath>
              </defs>
              </svg>
            </span>
          </div>
          
        </div>

        <button type="submit" class="formbold-btn">
            File fNOL
        </button>
    </form>
  </div>
</div>
  
</div>
          
<style>
  @import url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap');
  
  .container-2 {
  border: 2px solid;
  border-radius: 4px;
  padding: 10px;
  background: white;
  display: table;
  table-layout: fixed;
  width: 100%;
  height: 100px;
  box-sizing: border-box;
  border-spacing: 10px;
}
.item {
  /* float:left; */
  display: table-cell;
  vertical-align: middle;
  text-align: center;
 
}
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  body {
    font-family: "Inter", sans-serif;
    background: white;
  }
  .formbold-main-wrapper {
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 50px;
  }

  .formbold-form-wrapper {
    margin: 0 auto;
    max-width: 550px;
    width: 100%;
    background: white;
  }

  .formbold-input-flex {
    display: flex;
    gap: 20px;
    margin-bottom: 22px;
  }
  .formbold-input-flex > div {
    width: 50%;
    display: flex;
    flex-direction: column-reverse;
  }
  .formbold-textarea {
    display: flex;
    flex-direction: column-reverse;
  }

  .formbold-form-input {
    width: 100%;
    padding-bottom: 10px;
    border: none;
    border-bottom: 1px solid #DDE3EC;
    background:#DDE3EC;
    font-weight: 500;
    font-size: 16px;
    color: #07074D;
    outline: none;
    resize: none;
  }
  .formbold-form-input::placeholder {
    color: #536387;
  }
  .formbold-form-input:focus {
    border-color: #6A64F1;
  }
  .formbold-form-label {
    color: #07074D;
    font-weight: 500;
    font-size: 14px;
    line-height: 24px;
    display: block;
    margin-bottom: 18px;
  }
  .formbold-form-input:focus + .formbold-form-label {
    color: #6A64F1;
  }

  .formbold-input-file {
    margin-top: 30px;
  }
  .formbold-input-file input[type="file"] {
    position: absolute;
    top: 6px;
    left: 0;
    z-index: -1;
  }
  .formbold-input-file .formbold-input-label {
    display: flex;
    align-items: center;
    gap: 10px;
    position: relative;
  }

  .formbold-filename-wrapper {
    display: flex;
    flex-direction: column;
    gap: 6px;
    margin-bottom: 22px;
  }
  .formbold-filename {
    display: flex;
    align-items: center;
    justify-content: space-between;
    font-size: 14px;
    line-height: 24px;
    color: #536387;
  }
  .formbold-filename svg {
    cursor: pointer;
  }

  .formbold-btn {
    font-size: 16px;
    border-radius: 5px;
    padding: 12px 25px;
    border: none;
    font-weight: 500;
    background-color:#9ec645;
    color: white;
    cursor: pointer;
    margin-top: 25px;
    align-content: center;
    justify-content: center;
    align-items: center;
  }
  .formbold-btn:hover {
    box-shadow: 0px 3px 8px rgba(0, 0, 0, 0.05);
  }

</style>
        
    </body>
</html>