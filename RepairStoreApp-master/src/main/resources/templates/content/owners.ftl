<h1 class="page-header">List of Owners</h1>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Id</th>
        <th>Tax Registration Number</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Address</th>
        <th>Email</th>
        <th>Car Brand</th>
        <th>Car Plate</th>
        <th>User Type</th>
        <th></th>
    </tr>
    </thead>
    <tbody>

    <#list owners as owner>
        <tr>
        <td> ${owner.id}</td>
        <td> ${owner.taxRegistrationNumber}</td>
        <td> ${owner.firstName}</td>
        <td> ${owner.lastName}</td>
        <td> ${owner.address}</td>
        <td> ${owner.email}</td>
        <td> ${owner.carBrand}</td>
        <td> ${owner.carPlate}</td>
        <td> ${owner.userType}</td>


        <td class="text-right">
            <a class="btn btn-danger button-delete-confirmation" href="/admin/owners/${owner.id}/delete">Delete
            </a>
            <button class="btn btn-success" type="submit" value="Edit">Edit</button>
        </td>
        </tr>
    </#list>

    </tbody>

    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <a class="btn pull-right" href="/admin/owners/create">Δημιουργεία Νέου</a>
    </div>
</table>