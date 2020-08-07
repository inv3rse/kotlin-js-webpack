const path = require('path');

// Allow file references starting with src.
// Is there a less ugly way to get the project root?
config.resolve.alias = {
    src: path.resolve(__dirname, "../../../../src"),
}

config.module.rules.push(
    {
        test: /\.(svg|png|jpe?g|gif)$/i,
        loader: 'file-loader',
        options: {
            name: 'static/media/[name].[hash:8].[ext]',
            esModule: false
        },
    },
);