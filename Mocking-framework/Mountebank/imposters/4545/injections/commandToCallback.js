function callBack (request, logger) {
    if (request.method === "POST" && request.path === "/callback") {
        const body = JSON.parse(request.body);
        const url = body.url;
        const config = body.config;

        const fetch = require("node-fetch");
        fetch(url, config)
            .then(res => { logger.info(res.status); return res.json(); })
            .then(data => logger.info(JSON.stringify(data)))
            .catch(err => logger.error(err));
        return true;
    }
}