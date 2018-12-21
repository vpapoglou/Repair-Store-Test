<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>Create Owner</title>
</head>

<body>
<#include "partials/navbar.ftl">
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <#include "partials/sidebar.ftl">
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form class="form-horizontal" action="/admin/owners" method="POST" name="ownerForm" id="ownerForm">
                <h1 class="page-header">Create Owner</h1>

                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-group">
                        <@spring.bind "ownerForm.taxRegistrationNumber"/>
                            <label for="productCode">Tax Registration Number</label>
                            <input type="text" class="form-control" name="taxRegistrationNumber" id="taxRegistrationNumber" placeholder="Enter a valid Tax Number"/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "ownerForm.firstName"/>
                            <label for="productName">Firstname</label>
                            <input type="text" class="form-control" name="firstName" id="firstName"  placeholder="Enter First name" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "ownerForm.lastName"/>
                            <label for="productCode">Surname</label>
                            <input type="text" class="form-control" name="lastName" id="lastName" placeholder="Enter Last name" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "ownerForm.userName"/>
                            <label for="productName">User Name</label>
                            <input type="text" class="form-control" name="userName" id="userName"  placeholder="Enter User Name" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "ownerForm.address"/>
                            <label for="productCode">Address</label>
                            <input type="text" class="form-control" name="address" id="address" placeholder="Enter an Address"/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "ownerForm.carBrand"/>
                            <label for="productName">Car Brand</label>
                            <input type="text" class="form-control" name="carBrand" id="carBrand"  placeholder="Enter Car Brand"/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "ownerForm.carPlate"/>
                            <label for="productName">Car Plate</label>
                            <input type="text" class="form-control" name="carPlate" id="carPlate"  placeholder="Enter Car Plate" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "ownerForm.email"/>
                            <label for="productName">Email</label>
                            <input type="text" class="form-control" name="email" id="email"  placeholder="Enter Valid Email" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "ownerForm.password"/>
                            <label for="productName">Password</label>
                            <input type="password" class="form-control" name="password" id="password"  placeholder="Enter Password" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>
                    <div class="form-group">
                        <@spring.bind "ownerForm.userType"/>
                    <label for="productName">User Type</label>
                    <select name="userType" id="userType">

                        <option value="Admin">Admin</option>
                        <option value="Owner">Owner</option>
                    </select>
                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-success">Create</button>
                        <button type="reset" id="btn-clear" class="btn btn-danger">Reset</button>
                    </div>
                </div>


            </form>
        </div>
    </div>
</div>
<#include "partials/scripts.ftl">
</body>
</html>