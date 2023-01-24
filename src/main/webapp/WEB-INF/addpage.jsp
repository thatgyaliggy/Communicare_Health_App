<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Add Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
            integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>

    <body>
        <h2 align="center">Welcome to Medication Management</h2>
        <form action="add">
            <table align="center">
                <tr>
                    <td>Medication ID</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Medication Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Medication Count</td>
                    <td><input type="text" name="count"></td>
                </tr>
                <tr>
                    <td>Medication Description</td>
                    <td><input type="text" name="des"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="Add"></td>
                </tr>
            </table>
        </form>
    </body>

    </html>