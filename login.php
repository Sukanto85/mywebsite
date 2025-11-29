<?php
$username = $_POST['username'];
$password = $_POST['password'];

if ($username == "admin" && $password == "12345") {
    echo "Login berhasil!";
} else {
    echo "Username atau password salah!";
}
?>
