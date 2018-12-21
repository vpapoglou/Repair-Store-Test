<h1 class="page-header">List of Repairs</h1>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Description</th>
        <th>Repair Status</th>
        <th>Repair Type</th>
        <th>Service Cost</th>
        <th>Plate Number</th>
        <th></th>
    </tr>
    </thead>
    <tbody>

    <#list repairs as repair>

        <td> ${repair.description}</td>
        <td> ${repair.repairStatus}</td>
        <td> ${repair.repairType}</td>
        <td> ${repair.serviceCost}</td>
        <td> ${repair.plateNumber}</td>

        <td class="text-right">
        <a class="btn btn-danger button-delete-confirmation" href="/admin/repairs/${repair.repairID}/delete">Delete</a
        </td>
        <td class="text-right">
            <a class="btn btn-success" href="/admin/repairs/${repair.repairID}/edit">Edit</a>
        </td>
        </tr>
    </#list>

    </tbody>
</table>