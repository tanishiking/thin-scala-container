```sh
$ docker build -t thinscala .

$ docker image inspect thinscala | jq '.[0].Size'
64046091 // 64MB

$ time docker run --rm -it thinscala
Hello world!
docker run --rm -it thinscala  0.02s user 0.01s system 3% cpu 0.739 total
```
